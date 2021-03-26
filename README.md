# Desenvolva uma API RESTful
Deve ser desenvolvida uma API RESTful que nos permite gerenciar as informações das propriedades dos países (identificador – gerado automaticamente, nome, capital, região, sub-região, área).

* Deve ser possível criar um novo país a partir da API criada com todas as suas propriedades;
* Deve ser possível listar todos os países anteriormente criados;
* Deve ser possível modificar os dados de um país anteriormente criado;
* Deve ser possível eliminar um país anteriormente criado;
* Deve ser possível ordenar a lista dos países por qualquer uma das suas propriedades.


# Tecnologias utilizadas
* Sprint Boot
* Sprint Web, Rest Repositories, Data JPA, H2 Database (Dependencies)

# Attributes
* countryCode (primary key)
* countryName
* capitalCity
* region
* subregion
* area

# How to use
* Registering a country (on windows. For other OSs, the double quotes surrounding the dictionary should be replaced by single quotes and the double quotes in the dictionary should not be escaped)
```
$ curl -i -H "Content-Type:application/json" -d "{\"countryName\": \"Moçambique\", \"capitalCity\": \"Lourenço Marques\", \"region\": \"África\", \"subregion\": \"África do sudeste\", \"area\": 801590}" http://localhost:8080/countries
```

* List all countries
```
$ curl http://localhost:8080/countries
```
* Accessing a specific country (the number at the end should be replaced by the country's primary key)

```
$ curl http://localhost:8080/countries/1
```
```
$ curl http://localhost:8080/countries/search/findByCountryName{?name}
```

* Updating an entry

```
$ curl -X PUT -H "Content-Type:application/json" -d "{\"countryName\": \"Mozambique\", \"capitalCity\": \"Maputo\", \"region\": \"Africa\", \"subregion\": \"Southeast Africa\", \"area\": 701590}" http://localhost:8080/countries/1
```
```
$ curl -X PATCH -H "Content-Type:application/json" -d "{\"area\": 801590}" http://localhost:8080/countries/1
```

* Deleting an entry

```
$ curl -X DELETE http://localhost:8080/countries/1
```


# Como entregar
Você deve disponibilizar seu código em algum serviço de hospedagem como Github, Bitbucket ou Gitlab. 
É obrigatório ter um **README** com todas as instruções sobre o seu desafio.

Assim que finalizar, nos avise pelo e-mail devchallenge@2iBi.com com:
* Titulo: **[Backend Developer Challenge] Teu Nome**;
* Link do repositório com o desafio;
* Link com o desafio hospedado (necessário para avaliação);
* Informações sobre ti: Github, LinkedIn entre outras informações que consideras importantes.
