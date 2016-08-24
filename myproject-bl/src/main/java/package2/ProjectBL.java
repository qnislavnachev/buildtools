package package2;

import org.apache.log4j.Logger;

public class ProjectBL {
    public void print() {
        Logger log = Logger.getLogger(ProjectBL.class);
        log.info("1 more user in the system");
    }
}
