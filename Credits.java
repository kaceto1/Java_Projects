package com.java24hours;

class Credits {
    public static void main(String[] arguments) {
        //задаване на информацията за филма
        String title = "Sharknado";
        int year = 2013;
        String director = "Anthony Ferrante";
        String role1 = "Fin";
        String actor1 = "Ian Ziering";
        String role2 = "April";
        String actor2 = "Tara Reid";
        String role3 = "George";
        String actor3 = "John Heard";
        String role4 = "Nova";
        String actor4 = "Cassie Scerbo";
        String changeName = director.toUpperCase();
        boolean match = director.equals(changeName);
        
        //извеждане на информацията
        System.out.println(title + " (" + year + ")\n" +
                "A " + director + " film.\n\n" +
                role1 + "\t" + actor1 + "\n" +
                role2 + "\t" + actor2 + "\n" +
                role3 + "\t" + actor3 + "\n" +
                role4 + "\t" + actor4 + "\n");
        System.out.println(changeName + " is " + match + "\n" +
                "The position of \'F\' in the name " +
                director + " is " + director.indexOf("F"));
    }
}
