import { registerPlugin } from '@capacitor/core';

import type { GposPluginPlugin } from './definitions';

const GposPlugin = registerPlugin<GposPluginPlugin>('GposPlugin', {
  web: () => import('./web').then((m) => new m.GposPluginWeb()),
});

export * from './definitions';
export { GposPlugin };
