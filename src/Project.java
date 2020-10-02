import java.util.*;
import java.io.*;

public class Project {
    private String projName;
    private String projRepo;
    private String projStatus;
    private Date startDate;
    private Date endDate;
    private ArrayList<String> features;

    public Project() {
        projName = "";
        projRepo = "N/A";
        projStatus = "";
        startDate = new Date();
        endDate = new Date();
        features = new ArrayList<String>();
    }
}