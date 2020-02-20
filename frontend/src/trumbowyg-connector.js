
import 'trumbowyg/dist/trumbowyg.min.js';
import $fonts from 'trumbowyg/dist/ui/icons.svg';
const tpl = document.createElement('div');
tpl.id = "trumbowyg-icons";
tpl.innerHTML = `${$fonts}`;
document.body.appendChild(tpl);

window.initTrumbowyg = function(element) {
        jQuery(element).trumbowyg();
};


