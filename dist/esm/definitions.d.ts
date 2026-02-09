export interface GposPlugin {
    imprimirTexto(options: {
        mensagem: string;
        alinhar?: string;
        size?: number;
        font?: string;
    }): Promise<void>;
    statusImpressora(): Promise<{
        status: string;
    }>;
}
