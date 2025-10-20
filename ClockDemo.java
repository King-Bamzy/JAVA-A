LocalDateTime datetime = LocalDateTime.of(2016, Month.FEBRUARY, 15, 18, 20); // to display the result
//using Offset
zoneOffset sampleoffset = zoneOffset.of("-07:00");
OffsetDateTime date = OffsetDateTime.of(datetime, sampleoffset);
System.out.println("Sample display of Date and Time with timezone offset in java : " + date);

