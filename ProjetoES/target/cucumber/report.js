$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Teste.feature");
formatter.feature({
  "name": "Calc",
  "description": "\tComo usuario rentrar com dois valores\n\tCom o objetivo de obter um resultado",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Somar",
  "description": "",
  "keyword": "Cenario"
});
formatter.step({
  "name": "que eu escolha somar",
  "keyword": "Dado "
});
formatter.match({
  "location": "TestSteps.que_eu_escolha_somar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu preencho o primeiro numero com o valor \u00271\u0027",
  "keyword": "Quando "
});
formatter.match({
  "location": "TestSteps.eu_preencho_o_primeiro_numero_com_o_valor(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu preencho o segundo numero com \u00271\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "TestSteps.eu_preencho_o_segundo_numero_com(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu devo ver o resultado como \u00272\u0027",
  "keyword": "Entao "
});
formatter.match({
  "location": "TestSteps.eu_devo_ver_o_resultado_como(int)"
});
formatter.result({
  "status": "passed"
});
});