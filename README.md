# Groovy Console CSV Extension

[Avionos](http://www.avionos.com)

## Overview

CSV extension for the [AEM Groovy Console](https://github.com/icfnext/aem-groovy-console).  Adds binding and star import providers to facilitate printing CSV output in Groovy scripts using the [Apache Commons CSV library](http://commons.apache.org/proper/commons-csv/).

    csv.withFormat(CSVFormat.EXCEL) // defaults to CSVFormat.DEFAULT if not specified
    csv.printRecord("First Name", "Last Name")
    csv.printRecord("Mark", "Daugherty")

## Compatibility

Bundle Version | AEM Version(s)
------------ | -------------
0.x.x | 6.3, 6.4, 6.5

## Installation

1. Add the bundle as a dependency to an existing AEM project:

```xml
<dependency>
    <groupId>com.avionos.aem.groovyconsole.extensions</groupId>
    <artifactId>groovy-console-csv-extension</artifactId>
    <version>0.0.1</version>
    <scope>provided</scope>
</dependency>
```

## Versioning

Follows [Semantic Versioning](http://semver.org/) guidelines.