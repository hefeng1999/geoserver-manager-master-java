package it.geosolutions.geoserver.rest.gwc.tile.format;

/**
 * @author hefeng1999
 * @since 1.8.0
 */
@FunctionalInterface
public interface GWCTileFormat {

    String tileFormat();

    /**
     * jpeg
     */
    class JPEGTileFormat implements GWCTileFormat {

        @Override
        public String tileFormat() {
            return "image/jpeg";
        }

    }

    /**
     * png
     */
    class PNGTileFormat implements GWCTileFormat {

        @Override
        public String tileFormat() {
            return "image/png";
        }

    }

}
