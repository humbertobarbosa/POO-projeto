# CapTend 🧢

A ideia desse projeto é poder reunir, por meio de um plataforma, uma série de produtos disponíveis para venda. Os produtos em questão pertencem a uma loja de bonés, que deseja facilitar suas operações e trazer seus serviços para o meio digital. Com esse sistema, a loja poderá gerenciar todos os fluxos de entradas e saídas de recursos financeiros, controlar o estoque e oferecer aos clientes um ambiente de compras mais moderno e organizado.

## Sobre o algoritmo
O projeto busca explorar, de forma prática, _design patterns_ e orientação a objetos. Além disso, um objetivo paralelo é utilizar padrões de versionamento exigidos em cenários reais de desenvolvimento, com o uso de fluxos como o Git Flow.


### Descrição
Os **produtos** ficam armazenados em um **estoque**. Cada produto possui: **Nome, Preço, Quantidade, ID, Preço Original, Preço Atual, Um Modelo (Trucker, Aba Reta, Aba Curva, SnapBack, Dad Hat, Panel, StrapBack) e Uma lista de cores disponíveis**.  O **Usuário**, independente do tipo, precisa informar: **Nome, Email, Senha e Data de Nascimento.** Caso seja um **Admin**, deverá também informar uma **Chave de Acesso.** As **funções** do **estoque** estão limitadas para uso de um **Admin. (remover itens, alterar preços, adicionar itens, etc..**).

O **Cliente** pode **adicionar** e **remover** **produtos** ao seu **carrinho**, assim como **alterar a quantidade** individual de cada produto. Para **finalizar** o **pedido**, ele deve clicar em **Fechar pedido**, onde será gerado um **Pedido** de fato, e será necessário informar o **método de pagamento** e o **endereço de entrega**.  E o site retorna o **preço final**, junto com o **valor da entrega**, **dos itens** e **um desconto**, caso haja.

A seguir, esse **pedido** será adicionado a **lista de pedidos** do **cliente**, onde ele poderá acompanhar o **status** de cada pedido.

### Principais classes
- Command
- Bone
- BancoDados
- Usuário
- Carrinho
- Admin
- Cliente
- MetodoPagamentoCliente
- Pix
- Boleto
- CartaoCredito
- DescontoStrategy
- DescontoRacional
- DescontoComercial

### Padrões Utilizados
- Singleton -> BancoDados
- TemplateMethod -> MétodoPagamento
- Strategy -> Discount
- Command -> Cart

 
