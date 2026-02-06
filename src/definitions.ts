export interface GposPlugin {
  imprimirTexto(options: {
    mensagem: string;
    alinhar?: string;
    size?: number;
    font?: string; // Adicionado para suportar VECTRA.otf
  }): Promise<void>;

  statusImpressora(): Promise<{ status: string }>;
}
