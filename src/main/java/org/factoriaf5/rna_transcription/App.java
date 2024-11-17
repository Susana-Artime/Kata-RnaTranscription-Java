package org.factoriaf5.rna_transcription;

public class App {
    
    public static void main(String[] args) {

        RnaTranscription transcription = new RnaTranscription();
        String dna = "GATTACA";
        String rna = transcription.transcribe(dna);

        System.out.println("Secuencia de ARN: " + rna);
    }
}
