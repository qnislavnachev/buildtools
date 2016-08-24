package myprojectbase;

import myprojectbl.BLClass;
import org.apache.log4j.Logger;
import projectBO.ProjectBO;
import projectPL.ProjectPL;

public class MyClass {
    public static void main(String[] args) {
        Logger log = Logger.getLogger("logger");
        log.info("you are in the system!");

        BLClass bl = new BLClass();
        bl.print();

        ProjectBO bo = new ProjectBO();
        bo.print();

        ProjectPL pl = new ProjectPL();
        pl.print();

    }
}
