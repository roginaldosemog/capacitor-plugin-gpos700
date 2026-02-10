package com.galago.plugins.gpos;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "Gpos")
public class GposPlugin extends Plugin {

    private GertecPrinter gertecPrinter;
    private ConfigPrint configPrint = new ConfigPrint();

    @Override
    public void load() {
        // Inicializa a impressora usando o contexto do Capacitor
        gertecPrinter = new GertecPrinter(getContext());
        gertecPrinter.setConfigImpressao(configPrint);
    }

    @PluginMethod
    public void imprimirTexto(PluginCall call) {
        String mensagem = call.getString("mensagem");
        String alinhar = call.getString("alinhar", "CENTER");
        int size = call.getInt("size", 20);
        String fonte = call.getString("font", "NORMAL"); // Captura a fonte enviada

        try {
            if (gertecPrinter.isImpressoraOK()) {
                configPrint.setAlinhamento(alinhar);
                configPrint.setTamanho(size);
                configPrint.setFonte(fonte); // Define a fonte na configuração
                configPrint.setAvancaLinhas(2);

                gertecPrinter.setConfigImpressao(configPrint);
                gertecPrinter.imprimeTexto(mensagem);

                gertecPrinter.ImpressoraOutput();
                call.resolve();
            } else {
                call.reject("Impressora não está pronta ou sem papel.");
            }
        } catch (Exception e) {
            call.reject("Erro na impressão: " + e.getMessage());
        }
    }

    @PluginMethod
    public void statusImpressora(PluginCall call) {
        try {
            String status = gertecPrinter.getStatusImpressora();
            JSObject ret = new JSObject();
            ret.put("status", status);
            call.resolve(ret);
        } catch (Exception e) {
            call.reject(e.getMessage());
        }
    }
}
