package riot.api.lolstaticdata;

import com.squareup.okhttp.Request;
import riot.api.common.RequestService;
import riot.api.common.RiotApi;
import riot.api.common.RiotRequestBuilder;
import riot.api.constants.*;
import riot.api.lolstaticdata.models.*;

import java.io.IOException;

public class StaticDataApi extends RiotApi {
    private final static String VERSION = "1.2";

    public StaticDataApi(RequestService requestService) {
        super(requestService);
    }

    private Request getChampionsRequest(Region region, String locale, String version, boolean dataById, ChampData champData) {
        String path = "/api/lol/static-data/%s/v%s/champion";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(Region.GLOBAL, String.format(path, region.getRegionId(), getVersion()));
        requestBuilder.addQueryParameter(QueryParameters.LOCALE, locale);
        requestBuilder.addQueryParameter(QueryParameters.DD_VERSION, version);
        requestBuilder.addQueryParameter(QueryParameters.DATA_BY_ID, String.valueOf(dataById));
        requestBuilder.addQueryParameter(QueryParameters.CHAMP_DATA, champData.getValue());
        return requestBuilder.build();
    }

    public ChampionList getChampions(Region region, String locale, String version, boolean dataById, ChampData champData) throws IOException {
        return getRequestService().execute(getChampionsRequest(region, locale, version, dataById, champData), ChampionList.class);
    }

    public void getChampionsAsync(Region region, String locale, String version, boolean dataById, ChampData champData) {
        getRequestService().executeAsync(getChampionsRequest(region, locale, version, dataById, champData), ChampionList.class);
    }

    private Request getChampionRequest(Region region, int id, String locale, String version, ChampData champData) {
        String path = "/api/lol/static-data/%s/v%s/champion/%s";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(Region.GLOBAL, String.format(path, region.getRegionId(), getVersion(), id));
        requestBuilder.addQueryParameter(QueryParameters.LOCALE, locale);
        requestBuilder.addQueryParameter(QueryParameters.DD_VERSION, version);
        requestBuilder.addQueryParameter(QueryParameters.CHAMP_DATA, champData.getValue());
        return requestBuilder.build();
    }

    public Champion getChampion(Region region, int id, String locale, String version, ChampData champData) throws IOException {
        return getRequestService().execute(getChampionRequest(region, id, locale, version, champData), Champion.class);
    }

    public void getChampionAsync(Region region, int id, String locale, String version, ChampData champData) {
        getRequestService().executeAsync(getChampionRequest(region, id, locale, version, champData), Champion.class);
    }

    private Request getItemsRequest(Region region, String locale, String version, ItemListData itemListData) {
        String path = "/api/lol/static-data/%s/v%s/item";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(Region.GLOBAL, String.format(path, region.getRegionId(), getVersion()));
        requestBuilder.addQueryParameter(QueryParameters.LOCALE, locale);
        requestBuilder.addQueryParameter(QueryParameters.DD_VERSION, version);
        requestBuilder.addQueryParameter(QueryParameters.ITEM_LIST_DATA, itemListData.getValue());
        return requestBuilder.build();
    }

    public ItemList getItems(Region region, String locale, String version, ItemListData itemListData) throws IOException {
        return getRequestService().execute(getItemsRequest(region, locale, version, itemListData), ItemList.class);
    }

    public void getItemsAsync(Region region, String locale, String version, ItemListData itemListData) {
        getRequestService().executeAsync(getItemsRequest(region, locale, version, itemListData), ItemList.class);
    }

    private Request getItemRequest(Region region, int id, String locale, String version, ItemListData itemListData) {
        String path = "/api/lol/static-data/%s/v%s/item/%s";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(Region.GLOBAL, String.format(path, region.getRegionId(), getVersion(), id));
        requestBuilder.addQueryParameter(QueryParameters.LOCALE, locale);
        requestBuilder.addQueryParameter(QueryParameters.DD_VERSION, version);
        requestBuilder.addQueryParameter(QueryParameters.ITEM_LIST_DATA, itemListData.getValue());
        return requestBuilder.build();
    }

    public Item getItem(Region region, int id, String locale, String version, ItemListData itemListData) throws IOException {
        return getRequestService().execute(getItemRequest(region, id, locale, version, itemListData), Item.class);
    }

    public void getItemAsync(Region region, int id, String locale, String version, ItemListData itemListData) {
        getRequestService().executeAsync(getItemRequest(region, id, locale, version, itemListData), Item.class);
    }

    private Request getLanguageStringsRequest(Region region, String locale, String version) {
        String path = "/api/lol/static-data/%s/v%s/language-strings";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(Region.GLOBAL, String.format(path, region.getRegionId(), getVersion()));
        requestBuilder.addQueryParameter(QueryParameters.LOCALE, locale);
        requestBuilder.addQueryParameter(QueryParameters.DD_VERSION, version);
        return requestBuilder.build();
    }

    public LanguageStrings getLanguageStrings(Region region, String locale, String version) throws IOException {
        return getRequestService().execute(getLanguageStringsRequest(region, locale, version), LanguageStrings.class);
    }

    public void getLanguageStringsAsync(Region region, String locale, String version) {
        getRequestService().executeAsync(getLanguageStringsRequest(region, locale, version), LanguageStrings.class);
    }

    private Request getLanguagesRequest(Region region) {
        String path = "/api/lol/static-data/%s/v%s/languages";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(Region.GLOBAL, String.format(path, region.getRegionId(), getVersion()));
        return requestBuilder.build();
    }

    public LanguageStrings getLanguages(Region region) throws IOException {
        return getRequestService().execute(getLanguagesRequest(region), LanguageStrings.class);
    }

    public void getLanguagesAsync(Region region) {
        getRequestService().executeAsync(getLanguagesRequest(region), LanguageStrings.class);
    }

    private Request getMapsRequest(Region region, String locale, String version) {
        String path = "/api/lol/static-data/%s/v%s/map";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(Region.GLOBAL, String.format(path, region.getRegionId(), getVersion()));
        requestBuilder.addQueryParameter(QueryParameters.LOCALE, locale);
        requestBuilder.addQueryParameter(QueryParameters.DD_VERSION, version);
        return requestBuilder.build();
    }

    public MapData getMaps(Region region, String locale, String version) throws IOException {
        return getRequestService().execute(getMapsRequest(region, locale, version), MapData.class);
    }

    public void getMapsAsync(Region region, String locale, String version) {
        getRequestService().executeAsync(getMapsRequest(region, locale, version), MapData.class);
    }

    private Request getMasteriesRequest(Region region, String locale, String version, MasteryListData masteryListData) {
        String path = "/api/lol/static-data/%s/v%s/mastery";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(Region.GLOBAL, String.format(path, region.getRegionId(), getVersion()));
        requestBuilder.addQueryParameter(QueryParameters.LOCALE, locale);
        requestBuilder.addQueryParameter(QueryParameters.DD_VERSION, version);
        requestBuilder.addQueryParameter(QueryParameters.MASTERY_LIST_DATA, masteryListData.getValue());
        return requestBuilder.build();
    }

    public MasteryList getMasteries(Region region, String locale, String version, MasteryListData masteryListData) throws IOException {
        return getRequestService().execute(getMasteriesRequest(region, locale, version, masteryListData), MasteryList.class);
    }

    public void getMasteriesAsync(Region region, String locale, String version, MasteryListData masteryListData) {
        getRequestService().executeAsync(getMasteriesRequest(region, locale, version, masteryListData), MasteryList.class);
    }

    private Request getMasteryRequest(Region region, int id, String locale, String version, ItemListData itemListData) {
        String path = "/api/lol/static-data/%s/v%s/mastery/%s";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(Region.GLOBAL, String.format(path, region.getRegionId(), getVersion(), id));
        requestBuilder.addQueryParameter(QueryParameters.LOCALE, locale);
        requestBuilder.addQueryParameter(QueryParameters.DD_VERSION, version);
        requestBuilder.addQueryParameter(QueryParameters.MASTERY_LIST_DATA, itemListData.getValue());
        return requestBuilder.build();
    }

    public Mastery getMastery(Region region, int id, String locale, String version, ItemListData itemListData) throws IOException {
        return getRequestService().execute(getMasteryRequest(region, id, locale, version, itemListData), Mastery.class);
    }

    public void getMasteryAsync(Region region, int id, String locale, String version, ItemListData itemListData) {
        getRequestService().executeAsync(getMasteryRequest(region, id, locale, version, itemListData), Mastery.class);
    }

    private Request getRealmRequest(Region region) {
        String path = "/api/lol/static-data/%s/v%s/realm";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(Region.GLOBAL, String.format(path, region.getRegionId(), getVersion()));
        return requestBuilder.build();
    }

    public Realm getRealm(Region region) throws IOException {
        return getRequestService().execute(getRealmRequest(region), Realm.class);
    }

    public void getRealmAsync(Region region) {
        getRequestService().executeAsync(getLanguagesRequest(region), Realm.class);
    }

    private Request getRunesRequest(Region region, String locale, String version, RuneListData runeListData) {
        String path = "/api/lol/static-data/%s/v%s/rune";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(Region.GLOBAL, String.format(path, region.getRegionId(), getVersion()));
        requestBuilder.addQueryParameter(QueryParameters.LOCALE, locale);
        requestBuilder.addQueryParameter(QueryParameters.DD_VERSION, version);
        requestBuilder.addQueryParameter(QueryParameters.RUNE_LIST_DATA, runeListData.getValue());
        return requestBuilder.build();
    }

    public RuneList getRunes(Region region, String locale, String version, RuneListData runeListData) throws IOException {
        return getRequestService().execute(getRunesRequest(region, locale, version, runeListData), RuneList.class);
    }

    public void getRunesAsync(Region region, String locale, String version, MasteryListData masteryListData) {
        getRequestService().executeAsync(getMasteriesRequest(region, locale, version, masteryListData), RuneList.class);
    }

    private Request getRuneRequest(Region region, int id, String locale, String version, RuneListData runeListData) {
        String path = "/api/lol/static-data/%s/v%s/rune/%s";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(Region.GLOBAL, String.format(path, region.getRegionId(), getVersion(), id));
        requestBuilder.addQueryParameter(QueryParameters.LOCALE, locale);
        requestBuilder.addQueryParameter(QueryParameters.DD_VERSION, version);
        requestBuilder.addQueryParameter(QueryParameters.RUNE_LIST_DATA, runeListData.getValue());
        return requestBuilder.build();
    }

    public Rune getRune(Region region, int id, String locale, String version, RuneListData runeListData) throws IOException {
        return getRequestService().execute(getRuneRequest(region, id, locale, version, runeListData), Rune.class);
    }

    public void getRuneAsync(Region region, int id, String locale, String version, RuneListData runeListData) {
        getRequestService().executeAsync(getRuneRequest(region, id, locale, version, runeListData), Rune.class);
    }

    private Request getSummonerSpellsRequest(Region region, String locale, String version, SpellData spellData) {
        String path = "/api/lol/static-data/%s/v%s/summoner-spell";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(Region.GLOBAL, String.format(path, region.getRegionId(), getVersion()));
        requestBuilder.addQueryParameter(QueryParameters.LOCALE, locale);
        requestBuilder.addQueryParameter(QueryParameters.DD_VERSION, version);
        requestBuilder.addQueryParameter(QueryParameters.SPELL_DATA, spellData.getValue());
        return requestBuilder.build();
    }

    public SummonerSpellList getSummonerSpells(Region region, String locale, String version, SpellData spellData) throws IOException {
        return getRequestService().execute(getSummonerSpellsRequest(region, locale, version, spellData), SummonerSpellList.class);
    }

    public void getSummonerSpellsAsync(Region region, String locale, String version, SpellData spellData) {
        getRequestService().executeAsync(getSummonerSpellsRequest(region, locale, version, spellData), RuneList.class);
    }

    private Request getSummonerSpellRequest(Region region, int id, String locale, String version, SpellData spellData) {
        String path = "/api/lol/static-data/%s/v%s/summoner-spell/%s";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(Region.GLOBAL, String.format(path, region.getRegionId(), getVersion(), id));
        requestBuilder.addQueryParameter(QueryParameters.LOCALE, locale);
        requestBuilder.addQueryParameter(QueryParameters.DD_VERSION, version);
        requestBuilder.addQueryParameter(QueryParameters.SPELL_DATA, spellData.getValue());
        return requestBuilder.build();
    }

    public SummonerSpell getSummonerSpell(Region region, int id, String locale, String version, SpellData spellData) throws IOException {
        return getRequestService().execute(getSummonerSpellRequest(region, id, locale, version, spellData), SummonerSpell.class);
    }

    public void getSummonerSpellAsync(Region region, int id, String locale, String version, SpellData spellData) {
        getRequestService().executeAsync(getSummonerSpellRequest(region, id, locale, version, spellData), SummonerSpell.class);
    }

    private Request getVersionsRequest(Region region) {
        String path = "/api/lol/static-data/%s/v%s/versions";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(Region.GLOBAL, String.format(path, region.getRegionId(), getVersion()));
        return requestBuilder.build();
    }

    public VersionList getVersions(Region region) throws IOException {
        return getRequestService().execute(getVersionsRequest(region), VersionList.class);
    }

    public void getVersionsAsync(Region region) {
        getRequestService().executeAsync(getVersionsRequest(region), VersionList.class);
    }

    @Override
    public String getVersion() {
        return VERSION;
    }

    private class QueryParameters {
        private final static String LOCALE = "locale";
        private final static String DD_VERSION = "version";
        private final static String DATA_BY_ID = "dataById";
        private final static String CHAMP_DATA = "champData";
        private final static String ITEM_LIST_DATA = "itemListData";
        private final static String MASTERY_LIST_DATA = "masteryListData";
        private final static String RUNE_LIST_DATA = "runeListData";
        private final static String SPELL_DATA = "spellData";
    }
}
