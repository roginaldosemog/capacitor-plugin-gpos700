export interface GposPluginPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
