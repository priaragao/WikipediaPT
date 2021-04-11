$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Post.feature");
formatter.feature({
  "line": 1,
  "name": "Consulta",
  "description": "",
  "id": "consulta",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7373014000,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Search Lili Reinhart",
  "description": "",
  "id": "consulta;search-lili-reinhart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "access Wikipedia in Portuguese",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "search for \"Lili Reinhart\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "shows the text \"Lili Reinhart\" on title",
  "keyword": "Then "
});
formatter.match({
  "location": "Post.accessWikipediaInPortuguese()"
});
formatter.result({
  "duration": 3601107600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lili Reinhart",
      "offset": 12
    }
  ],
  "location": "Post.searchFor(String)"
});
formatter.result({
  "duration": 4688962700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lili Reinhart",
      "offset": 16
    }
  ],
  "location": "Post.showsTheTextOnTitle(String)"
});
formatter.result({
  "duration": 44029500,
  "status": "passed"
});
formatter.after({
  "duration": 1839462100,
  "status": "passed"
});
});