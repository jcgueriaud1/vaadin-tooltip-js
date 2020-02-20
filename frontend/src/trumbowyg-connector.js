
import 'trumbowyg/dist/trumbowyg.min.js';

window.initTrumbowyg = function(element) {
        jQuery(element).trumbowyg({
            svgPath: 'icons.svg' // or a path like '/assets/my-custom-path/icons.svg'
        });
};


