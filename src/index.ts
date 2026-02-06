import { registerPlugin } from '@capacitor/core';

import type { GposPlugin } from './definitions';

const Gpos = registerPlugin<GposPlugin>('Gpos');

export * from './definitions';
export { Gpos };
