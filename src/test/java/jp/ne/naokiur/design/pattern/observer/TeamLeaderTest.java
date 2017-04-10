package jp.ne.naokiur.design.pattern.observer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class TeamLeaderTest {

    @Test
    public void onlyJohn() {
        John john = new John();
        TeamLeader leader = new TeamLeader();
        TeamLeader boss = new TeamLeader();

        john.addManager(leader);
        john.addManager(boss);

        john.takeHoliday();

        assertThat(leader.reportAbsences(), equalTo("John Smith"));
        assertThat(boss.reportAbsences(), equalTo("John Smith"));
    }

    @Test
    public void JoneAndJane() {
        John john = new John();
        Jane jane = new Jane();
        TeamLeader leader = new TeamLeader();
        TeamLeader boss = new TeamLeader();

        john.addManager(leader);
        john.addManager(boss);

        // Jane's manager is only boss.
        jane.addManager(boss);

        john.takeHoliday();
        jane.takeHoliday();

        assertThat(leader.reportAbsences(), equalTo("John Smith"));
        assertThat(boss.reportAbsences(), equalTo("John Smith, Jane Doe"));
    }

}
