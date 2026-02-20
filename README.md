# capacitor-plugin-gpos700

Plugin for GPOS700

<span class="badge-npmversion">
  <a href="https://npmjs.org/package/capacitor-plugin-gpos700" title="View this project on NPM">
    <img src="https://img.shields.io/npm/v/capacitor-plugin-gpos700.svg" alt="NPM version" />
  </a>
</span>

## Install

```bash
npm install capacitor-plugin-gpos700
npx cap sync
```

## API

<docgen-index>

* [`imprimirTexto(...)`](#imprimirtexto)
* [`statusImpressora()`](#statusimpressora)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### imprimirTexto(...)

```typescript
imprimirTexto(options: { mensagem: string; alinhar?: string; size?: number; font?: string; }) => Promise<void>
```

| Param         | Type                                                                               |
| ------------- | ---------------------------------------------------------------------------------- |
| **`options`** | <code>{ mensagem: string; alinhar?: string; size?: number; font?: string; }</code> |

--------------------


### statusImpressora()

```typescript
statusImpressora() => Promise<{ status: string; }>
```

**Returns:** <code>Promise&lt;{ status: string; }&gt;</code>

--------------------

</docgen-api>
