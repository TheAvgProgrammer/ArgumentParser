class ArgumentParser{
    public static void main(String[] args) {
        if (args.length < 1){
            System.out.println("Invalid Arguments");
            return;
        }

        for (int i = 0; i<args.length; i+=2){
            if(i == args.length - 1 && !args[i].contains("--")) return;

            if(args[i].contains("--")){
                for (int j = 2; j<args[i].length(); j++){
                    System.out.print(args[i].charAt(j));
                }
                System.out.print(" = ");

                if(i == args.length - 1) return;

                if (args[i + 1].contains("--")){
                    i--;
                    System.out.println();
                    continue;
                }
            }
            System.out.print(args[i+1]);
            System.out.println();
        }
    }
}