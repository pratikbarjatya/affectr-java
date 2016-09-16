package io.theysay.affectr.client.api;

import io.theysay.affectr.client.AffectR;
import org.junit.Before;
import org.junit.Test;

public class ApiTest {

    public AffectR preceive;

    @Before
    public void setUp() throws Exception {
        preceive = new AffectR();
        preceive.accountDetails.setUsername(System.getenv("api_username"));
        preceive.accountDetails.setPassword(System.getenv("api_password"));
    }

    @Test
    public void testVersion() throws Exception {
        Version version = preceive.api.getVersion();
        System.out.println(String.format("Remote version: \"%s\": %s, \"AffectR-Engine\": %s", version.getName(), version.getVersion(), version.getEngineVersion()));
    }

    @Test
    public void testClassifyEmotion() throws Exception {
        Emotion[] emotions = preceive.api.classifyEmotion(
                "Afghan security forces have fought Taliban insurgents for hours in the centre of Kabul, after a major explosion shook the city."
        );
        for (Emotion e:emotions)
            System.out.println(String.format("Type: %s; Value: %s", e.getEmotionType(),e.getScore()));
    }
}