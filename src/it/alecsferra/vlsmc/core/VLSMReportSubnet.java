package it.alecsferra.vlsmc.core;

public class VLSMReportSubnet {

    private String netAddress;
    private String subnetName;
    private String subnetMask;
    private String broadcastAddress;
    private long hosts;
    private String range;

    VLSMReportSubnet() {
    }

    public VLSMReportSubnet(String subnetName,
            String netAddress,
            String subnetMask,
            String broadcastAddress,
            int hosts,
            String range) {

        this.hosts = hosts;
        this.netAddress = netAddress;
        this.subnetMask = subnetMask;
        this.broadcastAddress = broadcastAddress;
        this.range = range;
        this.subnetName = subnetName;
    }

    @Override
    public String toString() {
        
        return subnetName
                + " netAddress='" + netAddress + '\''
                + ", subnetMask='" + subnetMask + '\''
                + ", broadcastAddress='" + broadcastAddress + '\''
                + ", hosts='" + hosts + '\''
                + ", range='" + range + '\'';
    }

    public String getNetAddress() {
        return netAddress;
    }

    public void setNetAddress(String netAddress) {
        this.netAddress = netAddress;
    }

    public String getSubnetName() {
        return subnetName;
    }

    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    public String getSubnetMask() {
        return subnetMask;
    }

    public void setSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
    }

    public String getBroadcastAddress() {
        return broadcastAddress;
    }

    public void setBroadcastAddress(String broadcastAddress) {
        this.broadcastAddress = broadcastAddress;
    }

    public long getHosts() {
        return hosts;
    }

    public void setHosts(long hosts) {
        this.hosts = hosts;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }
}
