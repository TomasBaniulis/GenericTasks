package lt.code.academy.taskThree;

public class Main {

    public static void main(String[] args) {

        MapAs<DnsProvider, DnsServer> dnsMapAS = new MapAs<>();

        dnsMapAS.put(DnsProvider.GOOGLE, new DnsServer("8.8.8.8", "8.8.4.4"));
        dnsMapAS.put(DnsProvider.CLOUDFLARE, new DnsServer("1.1.1.1", "1.0.0.1"));

        DnsServer googleDns = dnsMapAS.get(DnsProvider.GOOGLE);

        System.out.println(googleDns);

        MapAs<String, String> wordMap = new MapAs<>();

        wordMap.put("Labas", "Hello");

        String labas = wordMap.get("Labas");

        System.out.println(labas);



    }
}
