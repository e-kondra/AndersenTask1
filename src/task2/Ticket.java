package task2;

import java.math.BigDecimal;
import java.time.Instant;


public class Ticket {

        private Long id;
        private String concertHall;
        private int eventCode;
        private long time;
        private boolean isPromo;
        private Sector sector;
        private float maxWeight;
        private BigDecimal price;

        public Ticket() {}

        public Ticket(Long id, String concertHall, int eventCode, boolean isPromo, Sector sector, float maxWeight, BigDecimal price) {
                this.id = id;
                this.concertHall = concertHall;
                this.eventCode = eventCode;
                this.time = Instant.now().getEpochSecond();
                this.isPromo = isPromo;
                this.sector = sector;
                this.maxWeight = maxWeight;
                this.price = price;
        }

        public Ticket(String concertHall, int eventCode) {
                this.concertHall = concertHall;
                this.eventCode = eventCode;
                this.time = Instant.now().getEpochSecond();
        }

        @Override
        public String toString() {
                return "Ticket. id: "+ id + ", concertHall: " + concertHall +
                        ", eventCode: " + eventCode + ", time: " + Instant.ofEpochSecond(time) +
                        ", isPromo: " + isPromo + ", sector: " + sector +
                        ", maxWeight: " + maxWeight +
                        ", price: " + ((price == null)? "null": price.setScale(2, BigDecimal.ROUND_HALF_UP));
        }
}
