package package1;

import org.apache.log4j.Logger;
import package2.ProjectBL;
import package3.ProjectBO;
import package4.ProjectPL;

public class MyProject {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(MyProject.class);
        log.info("You are in the System now !");

        ProjectBL bl = new ProjectBL();
        bl.print();

        ProjectBO bo = new ProjectBO();
        bo.print();

        ProjectPL pl = new ProjectPL();
        pl.print();
    }
}
