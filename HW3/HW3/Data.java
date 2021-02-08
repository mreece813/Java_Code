public class Data
{
        public static double average(Measurable[] objects, Filter over_amount)
        {
            double sum = 0;
            int accepted = 0;
            for (Measurable obj : objects)
            {
                if (over_amount.accept(obj))
                {
                    sum = sum + obj.getMeasure();
                    accepted++;
                }
            }
            if (accepted > 0) {
                return sum / accepted; 
            }
            else 
            { 
                return 0; 
            }
        }
}