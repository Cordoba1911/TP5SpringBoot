package config;

import audit.Revision;
import org.hibernate.envers.*;

public class CustomRevisionListener implements RevisionListener {

        public void newRevision(Object revisionEntity) {
            final Revision revision = (Revision) revisionEntity;
        }
}
