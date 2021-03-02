# json-view
Testando o uso da anotação @JsonView
A mesma é válida apenas para operações de view, ou seja, é aplicada na serialização do objeto e não na sua deserialização
O uso da config `spring.jackson.mapper.DEFAULT_VIEW_INCLUSION = true` ajuda nos casos de View indefinida