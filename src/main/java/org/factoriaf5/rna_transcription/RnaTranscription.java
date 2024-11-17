package org.factoriaf5.rna_transcription;


public class RnaTranscription {
    
    String transcribe(String dnaStrand) {

        StringBuilder rna = new StringBuilder();

        for (int i = 0; i < dnaStrand.length(); i++) {
            char nucleotide = dnaStrand.charAt(i);

            switch (nucleotide) {
                case 'G':
                    rna.append('C');
                    break;
                case 'C':
                    rna.append('G');
                    break;
                case 'T':
                    rna.append('A');
                    break;
                case 'A':
                    rna.append('U');
                    break;
                default:
                    throw new IllegalArgumentException("Secuencia de ADN inválida");
            }
        }

        return rna.toString();
    }
        
}


