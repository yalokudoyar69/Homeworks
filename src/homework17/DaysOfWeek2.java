package homework17;

public enum DaysOfWeek2 {

            MONDAY(1),
            TUESDAY(2),
            WEDNESDAY(3),
            THURSDAY(4),
            FRIDAY(5),
            SATURDAY(6),
            SUNDAY(7);

            private int dayOrderNumber;

            DaysOfWeek2(int dayOrderNumber) {
                this.dayOrderNumber = dayOrderNumber;
            }

            public int getDayOrderNumber() {
                return dayOrderNumber;
            }

            public static DaysOfWeek2 getDays(int dayOrderNumber) {
                switch (dayOrderNumber) {
                    case 1:
                        return DaysOfWeek2.MONDAY;
                    case 2:
                        return DaysOfWeek2.TUESDAY;
                    case 3:
                        return DaysOfWeek2.WEDNESDAY;
                    case 4:
                        return DaysOfWeek2.THURSDAY;
                    case 5:
                        return DaysOfWeek2.FRIDAY;
                    case 6:
                        return DaysOfWeek2.SATURDAY;
                    case 7:
                        return DaysOfWeek2.SUNDAY;
                    default:
                        throw new IllegalArgumentException("Неіснуючий номер дня тижня: " + dayOrderNumber);
                }
            }
        }
