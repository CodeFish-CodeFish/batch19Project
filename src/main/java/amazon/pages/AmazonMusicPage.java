package amazon.pages;

import amazon.Page;
import amazon.components.Language;
import amazon.components.Location;
import amazon.components.Logo;

import java.util.ArrayList;

public class AmazonMusicPage extends Page {

    public ArrayList<ArrayList<String>> featuredThisWeek;

    @Override
    protected Logo getLogo() {
        return null;
    }

    @Override
    protected Location getCurrentLocation() {
        return null;
    }

    @Override
    protected Language selectLanguage() {
        return null;
    }

}
