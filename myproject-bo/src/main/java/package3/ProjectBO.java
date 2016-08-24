package package3;

import org.apache.log4j.Logger;

public class ProjectBO {
    public void print() {
        Logger log = Logger.getLogger(ProjectBO.class);
        log.info("1 more user in the system");
    }
}
