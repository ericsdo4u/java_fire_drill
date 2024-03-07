public class LogisticsService {

        public static int calculationOfDispatchersBasePay(int numberOfDelivery){
            int result = 0;
            if(numberOfDelivery < 0) {
                throw new IllegalArgumentException("Invalid Input");

            } else if (numberOfDelivery <= 50) {
                 result =  numberOfDelivery  * 160 + 5000;

            } else if (numberOfDelivery <= 59) {
                 result =  numberOfDelivery * 200 + 5000;

            } else if (numberOfDelivery <= 69) {
                 result =  numberOfDelivery * 250 + 5000;

            }
            else if
                (numberOfDelivery >= 70 ){
                 result =  numberOfDelivery * 500 + 5000;
            }

            return result;
        }

        public static void main(String[] args) {
            try {
                System.out.println(LogisticsService.calculationOfDispatchersBasePay(90));
            }catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
            }


        }


}
