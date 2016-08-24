package package4;

import org.apache.log4j.Logger;

public class ProjectPL {
    public void print() {
        Logger log = Logger.getLogger(ProjectPL.class);
        log.info("1 more user in the system");
    }
}
