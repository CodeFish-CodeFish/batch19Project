package amazon;

import amazon.components.Language;
import amazon.components.Location;
import amazon.components.Logo;
import amazon.components.SearchBar;

public abstract class Page { // will serve as a base page, as a contract

    // logo
    public Logo logo;
    protected abstract Logo getLogo();

    // location
    public Location location;
    protected abstract Location getCurrentLocation();

    // search bar
    public SearchBar searchBar;

    // language selection
    public Language language;
    protected abstract Language selectLanguage();
}
