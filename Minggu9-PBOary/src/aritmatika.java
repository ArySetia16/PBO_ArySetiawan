class Aritmatika
{
    private int a, b;
    public Aritmatika(int x, int y)
    {
        this.a = x;
        this.b = y;
    }
    public int kali()
    {
        return a * b;
        }
    public void hasil()
    {
        System.out.println("Nilai A = " + this.a);
        System.out.println("Nilai B = " + this.b);
    }
}