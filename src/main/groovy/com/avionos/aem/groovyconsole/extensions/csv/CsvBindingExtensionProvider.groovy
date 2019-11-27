package com.avionos.aem.groovyconsole.extensions.csv

import com.icfolson.aem.groovy.console.api.BindingExtensionProvider
import com.icfolson.aem.groovy.console.api.BindingVariable
import com.icfolson.aem.groovy.console.api.ScriptContext
import org.apache.commons.csv.CSVPrinter
import org.osgi.service.component.annotations.Component

@Component(service = BindingExtensionProvider)
class CsvBindingExtensionProvider implements BindingExtensionProvider {

    private static final String LINK = "http://commons.apache.org/proper/commons-csv/apidocs/index.html?org/apache/commons/csv/CSVPrinter.html"

    @Override
    Map<String, BindingVariable> getBindingVariables(ScriptContext scriptContext) {
        def csvPrinter = scriptContext.printStream ? new GroovyConsoleCsvPrinter(scriptContext.printStream) : null

        [csv: new BindingVariable(csvPrinter, CSVPrinter, LINK)]
    }
}