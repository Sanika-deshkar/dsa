class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
/*if input: 1.1.1.1
then defanged version of IP address is
output: 1[.]1[.]1.[.]1
*/
