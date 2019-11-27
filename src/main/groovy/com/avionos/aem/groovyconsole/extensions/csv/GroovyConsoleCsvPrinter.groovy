package com.avionos.aem.groovyconsole.extensions.csv

import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVPrinter

class GroovyConsoleCsvPrinter {

    private Appendable out

    @Delegate
    private CSVPrinter delegate

    GroovyConsoleCsvPrinter(Appendable out) {
        this.out = out

        delegate = new CSVPrinter(out, CSVFormat.DEFAULT)
    }

    GroovyConsoleCsvPrinter withFormat(CSVFormat format) {
        delegate = new CSVPrinter(out, format)

        this
    }
}
