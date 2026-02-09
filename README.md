# capacitor-plugin-gpos700

Plugin for GPOS700

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
