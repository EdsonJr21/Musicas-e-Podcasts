# Projeto de Músicas e Podcasts

Este projeto implementa um sistema para gerenciar músicas e podcasts, permitindo reproduzir, curtir e classificar cada item. O sistema também determina as músicas e podcasts preferidos dos usuários com base em suas interações.

## Estrutura do Projeto

- `Principal.java`: Ponto de entrada do programa, responsável por criar e manipular instâncias de músicas e podcasts.
- `Audio.java`: Classe base que define atributos e métodos comuns para `Musica` e `PodCast`.
- `Musica.java`: Classe que representa uma música, herda de `Audio`.
- `PodCast.java`: Classe que representa um podcast, herda de `Audio`.
- `MusicasPreferidas.java`: Classe que gerencia e exibe as músicas e podcasts preferidos dos usuários.

## Funcionalidades

### Reproduzir e Curtir

Usuários podem reproduzir e curtir músicas e podcasts, aumentando seus contadores de reproduções e curtidas.

### Classificação

Músicas e podcasts recebem uma classificação baseada em suas reproduções e curtidas:
- Músicas: Classificação de 10 se total de reproduções > 2000, caso contrário 7.
- Podcasts: Classificação de 10 se total de curtidas > 500, caso contrário 8.

### Preferências dos Usuários

O sistema determina se uma música ou podcast é considerado excelente ou uma das melhores com base em sua classificação.

## Exemplo de Uso

```plaintext
Forever É considerado uma das melhores entre os Usuários
BolhaDev É considerado excelente entre os Usuários
