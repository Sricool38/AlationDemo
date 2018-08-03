$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("get_product_details.feature");
formatter.feature({
  "line": 1,
  "name": "To Navigate to Bookes category and validate the details of the product in Amazon.com",
  "description": "",
  "id": "to-navigate-to-bookes-category-and-validate-the-details-of-the-product-in-amazon.com",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "",
  "description": "Validate the product information in search result page \u0026 product details page in Amazon",
  "id": "to-navigate-to-bookes-category-and-validate-the-details-of-the-product-in-amazon.com;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "change the search category to \u0027Books\u0027",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "# To reuse this step for different category just change the name inside single quotes"
    }
  ],
  "line": 8,
  "name": "I search item \u003cproductType\u003e",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "# To reuse this step for different product, just change or add the product in Example section below"
    }
  ],
  "line": 10,
  "name": "I should be directed to the search results of \"\u003cproductType\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "verify the product details in search result page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select the first available product in the page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "verify the product details in product detail page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Validate the product details in PDP with SRP",
  "keyword": "And "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "to-navigate-to-bookes-category-and-validate-the-details-of-the-product-in-amazon.com;;",
  "rows": [
    {
      "cells": [
        "productType"
      ],
      "line": 17,
      "id": "to-navigate-to-bookes-category-and-validate-the-details-of-the-product-in-amazon.com;;;1"
    },
    {
      "cells": [
        "data catalog"
      ],
      "line": 18,
      "id": "to-navigate-to-bookes-category-and-validate-the-details-of-the-product-in-amazon.com;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 45873256972,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "",
  "description": "Validate the product information in search result page \u0026 product details page in Amazon",
  "id": "to-navigate-to-bookes-category-and-validate-the-details-of-the-product-in-amazon.com;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "change the search category to \u0027Books\u0027",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "# To reuse this step for different category just change the name inside single quotes"
    }
  ],
  "line": 8,
  "name": "I search item data catalog",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "# To reuse this step for different product, just change or add the product in Example section below"
    }
  ],
  "line": 10,
  "name": "I should be directed to the search results of \"data catalog\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "verify the product details in search result page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select the first available product in the page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "verify the product details in product detail page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Validate the product details in PDP with SRP",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Books",
      "offset": 31
    }
  ],
  "location": "HomePageStepDef.change_the_search_category(String)"
});
formatter.result({
  "duration": 1404147778,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "data catalog",
      "offset": 14
    }
  ],
  "location": "HomePageStepDef.i_search_item(String)"
});
formatter.result({
  "duration": 7193791239,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\"data catalog\"",
      "offset": 46
    }
  ],
  "location": "SearchResultPageStepDef.i_should_be_directed_to_the_search_results(String)"
});
formatter.result({
  "duration": 160350722,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultPageStepDef.verify_the_product_details_in_search_result_page()"
});
formatter.result({
  "duration": 745075822,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultPageStepDef.select_the_first_available_product_in_the_page()"
});
formatter.result({
  "duration": 7374725403,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailsPageStepDef.verify_the_product_details_in_product_deatils_page()"
});
formatter.result({
  "duration": 516964182,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailsPageStepDef.validate_the_product_details_in_pdp_with_srp()"
});
formatter.result({
  "duration": 3818701,
  "status": "passed"
});
formatter.after({
  "duration": 1360400387,
  "status": "passed"
});
});