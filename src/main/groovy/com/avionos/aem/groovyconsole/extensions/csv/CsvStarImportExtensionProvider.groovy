package com.avionos.aem.groovyconsole.extensions.csv

import com.icfolson.aem.groovy.console.api.StarImport
import com.icfolson.aem.groovy.console.api.StarImportExtensionProvider
import org.osgi.service.component.annotations.Component

@Component(service = StarImportExtensionProvider)
class CsvStarImportExtensionProvider implements StarImportExtensionProvider {

    private static final Set<StarImport> STAR_IMPORTS = [
        new StarImport("org.apache.commons.csv", "http://commons.apache.org/proper/commons-csv/apidocs/org/apache/commons/csv/package-summary.html")
    ] as Set

    @Override
    Set<StarImport> getStarImports() {
        STAR_IMPORTS
    }
}
