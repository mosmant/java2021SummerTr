package day30_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C02_LocalTime {

	public static void main(String[] args) {
		LocalTime zaman = LocalTime.now();

		System.out.println("akt�el zaman : " + zaman); // akt�el zaman : 21:37:46.318332600

		LocalTime time1 = LocalTime.of(12, 35, 23);

		System.out.println(time1);

		System.out.println("�u zamandan 2 saat ileri 34 dk geri 45 sn ileri : "
				+ zaman.plusHours(2).minusMinutes(34).plusSeconds(45));
		// 23:08:12.088664100

		for (int i = 0; i < 10000; i++) {
			System.out.print(i + ",");
		}
		LocalTime zaman2 = LocalTime.now();
		System.out.println();
		System.out.println(zaman2);

		// �lke saatleri hesaplama

		ZonedDateTime japan = ZonedDateTime.now(ZoneId.of("Japan")); // japonya yerel zaman�

		System.out.println("japonya i�in yerel zaman : " + japan);

		ZonedDateTime moscow = ZonedDateTime.now(ZoneId.of("Europe/Moscow")); // Moskova yerel zaman�

		System.out.println("moskova i�in yerel zaman : " + moscow);

		ZonedDateTime newyork = ZonedDateTime.now(ZoneId.of("America/New_York")); // New York yerel zaman�

		System.out.println("New York i�in yerel zaman : " + newyork);


	}

}
