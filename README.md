# Padrão Abstract Factory

Exemplo que combina três padrões criacionais — **Abstract Factory**, **Factory Method**
e **Singleton** — em um cadastro de documentos por tipo de cliente (Pessoa Física e
Pessoa Jurídica). Cada fábrica cria a família consistente de Contrato e Procuração;
o MetodoFabrica, que é um Singleton, decide e devolve a fábrica correta.

## Conteúdo do repositório

- **Código-fonte** do exemplo implementando os padrões Abstract Factory, Factory Method e Singleton.
- **Casos de teste** (JUnit) cobrindo a instância única, a seleção da fábrica e a consistência das famílias.
- **Diagrama UML** das classes, em formato de imagem.
