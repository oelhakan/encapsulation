public class Printer2 {
        private int tonerLevel;
        private int pagesPrinted;
        private boolean duplex;

        public Printer2 (int tonerLevel, boolean duplex){
            if(tonerLevel > -1 && tonerLevel <= 100){
                this.tonerLevel = tonerLevel;
            }
            else{
                this.tonerLevel = -1;
            }
            this.duplex = duplex;
            this.pagesPrinted = 0;
        }

        public int getPagesPrinted(){
            return this.pagesPrinted;
        }

        public int addToner(int tonerAmount){
            if(tonerAmount > 0 && tonerAmount <= 100) {
                if ((tonerAmount + this.tonerLevel) > 100) return -1;
                else return (this.tonerLevel += tonerAmount);
            }
            return -1;
        }

        public int printPages(int pages){
            int pagesToPrint = pages;
            if(this.duplex){
                pagesToPrint = (pages/2) + (pages%2);
                System.out.println("printing in duplex mode");
            }
            this.pagesPrinted = pagesToPrint;
            return pagesToPrint;
        }

    }

