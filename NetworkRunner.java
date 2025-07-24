class NetworkRunner {

    public static void main(String[] args) {
        System.out.println("Network Program Started\n");

        // 1st
        Network n1 = new Network();
        n1.networkId = 1;
        n1.name = "Home WiFi";
        n1.type = "WiFi";
        n1.speedMbps = 150.0;
        n1.isSecure = true;
        n1.protocol = "TCP/IP";

        System.out.println("1st...");
        System.out.println("networkId: " + n1.networkId);
        System.out.println("name: " + n1.name);
        System.out.println("type: " + n1.type);
        System.out.println("speedMbps: " + n1.speedMbps);
        System.out.println("isSecure: " + n1.isSecure);
        System.out.println("protocol: " + n1.protocol);
        System.out.println();

        // 2nd
        Network n2 = new Network();
        n2.networkId = 2;
        n2.name = "Office Ethernet";
        n2.type = "Ethernet";
        n2.speedMbps = 1000.0;
        n2.isSecure = true;
        n2.protocol = "TCP/IP";

        System.out.println("2nd...");
        System.out.println("networkId: " + n2.networkId);
        System.out.println("name: " + n2.name);
        System.out.println("type: " + n2.type);
        System.out.println("speedMbps: " + n2.speedMbps);
        System.out.println("isSecure: " + n2.isSecure);
        System.out.println("protocol: " + n2.protocol);
        System.out.println();

        // 3rd
        Network n3 = new Network();
        n3.networkId = 3;
        n3.name = "Public Hotspot";
        n3.type = "WiFi";
        n3.speedMbps = 50.0;
        n3.isSecure = false;
        n3.protocol = "TCP/IP";

        System.out.println("3rd...");
        System.out.println("networkId: " + n3.networkId);
        System.out.println("name: " + n3.name);
        System.out.println("type: " + n3.type);
        System.out.println("speedMbps: " + n3.speedMbps);
        System.out.println("isSecure: " + n3.isSecure);
        System.out.println("protocol: " + n3.protocol);
        System.out.println();

        // 4th
        Network n4 = new Network();
        n4.networkId = 4;
        n4.name = "4G LTE";
        n4.type = "Cellular";
        n4.speedMbps = 75.0;
        n4.isSecure = true;
        n4.protocol = "TCP/IP";

        System.out.println("4th...");
        System.out.println("networkId: " + n4.networkId);
        System.out.println("name: " + n4.name);
        System.out.println("type: " + n4.type);
        System.out.println("speedMbps: " + n4.speedMbps);
        System.out.println("isSecure: " + n4.isSecure);
        System.out.println("protocol: " + n4.protocol);
        System.out.println();

        // 5th
        Network n5 = new Network();
        n5.networkId = 5;
        n5.name = "5G Network";
        n5.type = "Cellular";
        n5.speedMbps = 500.0;
        n5.isSecure = true;
        n5.protocol = "TCP/IP";

        System.out.println("5th...");
        System.out.println("networkId: " + n5.networkId);
        System.out.println("name: " + n5.name);
        System.out.println("type: " + n5.type);
        System.out.println("speedMbps: " + n5.speedMbps);
        System.out.println("isSecure: " + n5.isSecure);
        System.out.println("protocol: " + n5.protocol);
        System.out.println();

        // 6th
        Network n6 = new Network();
        n6.networkId = 6;
        n6.name = "Satellite Net";
        n6.type = "Satellite";
        n6.speedMbps = 25.0;
        n6.isSecure = false;
        n6.protocol = "TCP/IP";

        System.out.println("6th...");
        System.out.println("networkId: " + n6.networkId);
        System.out.println("name: " + n6.name);
        System.out.println("type: " + n6.type);
        System.out.println("speedMbps: " + n6.speedMbps);
        System.out.println("isSecure: " + n6.isSecure);
        System.out.println("protocol: " + n6.protocol);
        System.out.println();

        // 7th
        Network n7 = new Network();
        n7.networkId = 7;
        n7.name = "Campus WiFi";
        n7.type = "WiFi";
        n7.speedMbps = 300.0;
        n7.isSecure = true;
        n7.protocol = "TCP/IP";

        System.out.println("7th...");
        System.out.println("networkId: " + n7.networkId);
        System.out.println("name: " + n7.name);
        System.out.println("type: " + n7.type);
        System.out.println("speedMbps: " + n7.speedMbps);
        System.out.println("isSecure: " + n7.isSecure);
        System.out.println("protocol: " + n7.protocol);
        System.out.println();

        // 8th
        Network n8 = new Network();
        n8.networkId = 8;
        n8.name = "Corporate VPN";
        n8.type = "VPN";
        n8.speedMbps = 150.0;
        n8.isSecure = true;
        n8.protocol = "UDP";

        System.out.println("8th...");
        System.out.println("networkId: " + n8.networkId);
        System.out.println("name: " + n8.name);
        System.out.println("type: " + n8.type);
        System.out.println("speedMbps: " + n8.speedMbps);
        System.out.println("isSecure: " + n8.isSecure);
        System.out.println("protocol: " + n8.protocol);
        System.out.println();

        // 9th
        Network n9 = new Network();
        n9.networkId = 9;
        n9.name = "Data Center LAN";
        n9.type = "Ethernet";
        n9.speedMbps = 10000.0;
        n9.isSecure = true;
        n9.protocol = "TCP/IP";

        System.out.println("9th...");
        System.out.println("networkId: " + n9.networkId);
        System.out.println("name: " + n9.name);
        System.out.println("type: " + n9.type);
        System.out.println("speedMbps: " + n9.speedMbps);
        System.out.println("isSecure: " + n9.isSecure);
        System.out.println("protocol: " + n9.protocol);
        System.out.println();

        // 10th
        Network n10 = new Network();
        n10.networkId = 10;
        n10.name = "Smart Home Net";
        n10.type = "WiFi";
        n10.speedMbps = 200.0;
        n10.isSecure = true;
        n10.protocol = "TCP/IP";

        System.out.println("10th...");
        System.out.println("networkId: " + n10.networkId);
        System.out.println("name: " + n10.name);
        System.out.println("type: " + n10.type);
        System.out.println("speedMbps: " + n10.speedMbps);
        System.out.println("isSecure: " + n10.isSecure);
        System.out.println("protocol: " + n10.protocol);
        System.out.println();

        // 11th
        Network n11 = new Network();
        n11.networkId = 11;
        n11.name = "Gaming LAN";
        n11.type = "Ethernet";
        n11.speedMbps = 500.0;
        n11.isSecure = true;
        n11.protocol = "TCP/IP";

        System.out.println("11th...");
        System.out.println("networkId: " + n11.networkId);
        System.out.println("name: " + n11.name);
        System.out.println("type: " + n11.type);
        System.out.println("speedMbps: " + n11.speedMbps);
        System.out.println("isSecure: " + n11.isSecure);
        System.out.println("protocol: " + n11.protocol);
        System.out.println();

        // 12th
        Network n12 = new Network();
        n12.networkId = 12;
        n12.name = "5GHz WiFi";
        n12.type = "WiFi";
        n12.speedMbps = 400.0;
        n12.isSecure = true;
        n12.protocol = "TCP/IP";

        System.out.println("12th...");
        System.out.println("networkId: " + n12.networkId);
        System.out.println("name: " + n12.name);
        System.out.println("type: " + n12.type);
        System.out.println("speedMbps: " + n12.speedMbps);
        System.out.println("isSecure: " + n12.isSecure);
        System.out.println("protocol: " + n12.protocol);
        System.out.println();

        // 13th
        Network n13 = new Network();
        n13.networkId = 13;
        n13.name = "Public Library WiFi";
        n13.type = "WiFi";
        n13.speedMbps = 75.0;
        n13.isSecure = false;
        n13.protocol = "TCP/IP";

        System.out.println("13th...");
        System.out.println("networkId: " + n13.networkId);
        System.out.println("name: " + n13.name);
        System.out.println("type: " + n13.type);
        System.out.println("speedMbps: " + n13.speedMbps);
        System.out.println("isSecure: " + n13.isSecure);
        System.out.println("protocol: " + n13.protocol);
        System.out.println();

        // 14th
        Network n14 = new Network();
        n14.networkId = 14;
        n14.name = "Industrial IoT Net";
        n14.type = "WiFi";
        n14.speedMbps = 10.0;
        n14.isSecure = true;
        n14.protocol = "TCP/IP";

        System.out.println("14th...");
        System.out.println("networkId: " + n14.networkId);
        System.out.println("name: " + n14.name);
        System.out.println("type: " + n14.type);
        System.out.println("speedMbps: " + n14.speedMbps);
        System.out.println("isSecure: " + n14.isSecure);
        System.out.println("protocol: " + n14.protocol);
        System.out.println();

        // 15th
        Network n15 = new Network();
        n15.networkId = 15;
        n15.name = "Campus Ethernet";
        n15.type = "Ethernet";
        n15.speedMbps = 1000.0;
        n15.isSecure = true;
        n15.protocol = "TCP/IP";

        System.out.println("15th...");
        System.out.println("networkId: " + n15.networkId);
        System.out.println("name: " + n15.name);
        System.out.println("type: " + n15.type);
        System.out.println("speedMbps: " + n15.speedMbps);
        System.out.println("isSecure: " + n15.isSecure);
        System.out.println("protocol: " + n15.protocol);
        System.out.println();

        // 16th
        Network n16 = new Network();
        n16.networkId = 16;
        n16.name = "Rural Satellite";
        n16.type = "Satellite";
        n16.speedMbps = 15.0;
        n16.isSecure = false;
        n16.protocol = "TCP/IP";

        System.out.println("16th...");
        System.out.println("networkId: " + n16.networkId);
        System.out.println("name: " + n16.name);
        System.out.println("type: " + n16.type);
        System.out.println("speedMbps: " + n16.speedMbps);
        System.out.println("isSecure: " + n16.isSecure);
        System.out.println("protocol: " + n16.protocol);
        System.out.println();

        // 17th
        Network n17 = new Network();
        n17.networkId = 17;
        n17.name = "Corporate Intranet";
        n17.type = "Ethernet";
        n17.speedMbps = 2000.0;
        n17.isSecure = true;
        n17.protocol = "TCP/IP";

        System.out.println("17th...");
        System.out.println("networkId: " + n17.networkId);
        System.out.println("name: " + n17.name);
        System.out.println("type: " + n17.type);
        System.out.println("speedMbps: " + n17.speedMbps);
        System.out.println("isSecure: " + n17.isSecure);
        System.out.println("protocol: " + n17.protocol);
        System.out.println();

        // 18th
        Network n18 = new Network();
        n18.networkId = 18;
        n18.name = "Satellite Internet";
        n18.type = "Satellite";
        n18.speedMbps = 50.0;
        n18.isSecure = false;
        n18.protocol = "TCP/IP";

        System.out.println("18th...");
        System.out.println("networkId: " + n18.networkId);
        System.out.println("name: " + n18.name);
        System.out.println("type: " + n18.type);
        System.out.println("speedMbps: " + n18.speedMbps);
        System.out.println("isSecure: " + n18.isSecure);
        System.out.println("protocol: " + n18.protocol);
        System.out.println();

        // 19th
        Network n19 = new Network();
        n19.networkId = 19;
        n19.name = "Mobile Hotspot";
        n19.type = "Cellular";
        n19.speedMbps = 100.0;
        n19.isSecure = true;
        n19.protocol = "TCP/IP";

        System.out.println("19th...");
        System.out.println("networkId: " + n19.networkId);
        System.out.println("name: " + n19.name);
        System.out.println("type: " + n19.type);
        System.out.println("speedMbps: " + n19.speedMbps);
        System.out.println("isSecure: " + n19.isSecure);
        System.out.println("protocol: " + n19.protocol);
        System.out.println();

        // 20th
        Network n20 = new Network();
        n20.networkId = 20;
        n20.name = "Private VPN";
        n20.type = "VPN";
        n20.speedMbps = 200.0;
        n20.isSecure = true;
        n20.protocol = "UDP";

        System.out.println("20th...");
        System.out.println("networkId: " + n20.networkId);
        System.out.println("name: " + n20.name);
        System.out.println("type: " + n20.type);
        System.out.println("speedMbps: " + n20.speedMbps);
        System.out.println("isSecure: " + n20.isSecure);
        System.out.println("protocol: " + n20.protocol);
        System.out.println();
    }
}
