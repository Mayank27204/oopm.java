package Model;

public interface item {

    void set_gst(int gst);
    int get_gst();
    void add_specifications(String s );
    void remove_specification(int specificaton_no);
    void display_specificatons();

}
