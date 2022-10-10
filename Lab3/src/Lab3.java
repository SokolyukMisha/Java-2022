public class Lab3 {

    public static void main(String[] args) {
        String text = "‘My head really hurts….’\n" +
                "\n" +
                "This was Fang Ming’s first thought upon waking up. It felt as if there was a cut on his head, hurting so badly that it seemed as if his skull was about to crack apart.\n" +
                "\n" +
                "As his consciousness cleared, he realised he was riding on what seemed like a horse carriage. His body bounced along to the rhythm of the moving carriage, sending shockwaves through the wound. The pain was so great that he had to suck in several sharp breaths.\n" +
                "\n" +
                "Opening his eyes, he surveyed his surroundings.\n" +
                "\n" +
                "What filled his vision were walls formed from hollowed planks. Sharing this carriage with him were quite a few fair-haired and blue-eyed youths, their eyes closed in their reverie. Not one of them bothered to spare a glance in his direction.\n" +
                "\n" +
                "He seemed to be lying down on the floor of the carriage. Feeling the biting cold from the wood, Fang Ming realised that his body would not be able to bear lying down much longer. To avoid catching a cold, he struggled hard to get up in a hurry.\n" +
                "\n" +
                "At that moment, he felt a sharp pain lancing through his head.\n" +
                "\n" +
                "The pain was sudden, and brought with it a flood of strange memories. Fang Ming’s eyes rolled back as he fainted.\n" +
                "\n" +
                "“Leylin... Leylin! Wake up…” Fang Ming heard in his daze, and couldn’t help but open his eyes.\n" +
                "\n" +
                "‘Is this… reincarnation?’ He still clearly remembered the dazzling flames from the energy reactor’s explosion, one that was impossible to survive with his lack of protection. On top of that, this type of carriage made of wooden planks was considered an ancient antique in his old world, and would definitely not be used.";
        //this text i took from the light novel Warlock of the Magus World by Author:Wang Yu

        String[] sentences = text.split("[.?!]");
        System.out.println("Number of sentences: " + sentences.length);
        System.out.println("Sentences with the same words in text: " + sentencesWithSameWord(text));

    }


    public static int sentencesWithSameWord(String text){
        int count = 0;
        String[] sentences = text.split("[.?!]");
        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            for (int j = 0; j < words.length; j++) {
                for (int k = j + 1; k < words.length; k++) {
                    if (words[j].equals(words[k])) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
}