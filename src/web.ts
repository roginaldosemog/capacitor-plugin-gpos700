import { WebPlugin } from '@capacitor/core';

import type { GposPluginPlugin } from './definitions';

export class GposPluginWeb extends WebPlugin implements GposPluginPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
