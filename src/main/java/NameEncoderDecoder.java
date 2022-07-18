class NameEncoderDecoder{
    public String encode(String name) {
        return "NOTFORYOU" +
                name.replace("e", "1")
                        .replace("u", "2")
                        .replace("i", "3")
                        .replace("o", "4")
                        .replace("a", "5")
                + "YESNOTFORYOU";
    }

    public String decode(String name) {
        return name
                .substring(0, name.length() - 12)
                .substring(9)
                .replace("1", "e")
                .replace("2", "u")
                .replace("3", "i")
                .replace("4", "o")
                .replace("5", "a");
    }
}
