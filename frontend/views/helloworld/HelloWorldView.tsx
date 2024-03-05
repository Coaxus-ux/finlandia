import { Button } from '@hilla/react-components/Button.js';
import { Notification } from '@hilla/react-components/Notification.js';
import { TextField } from '@hilla/react-components/TextField.js';
import { AnimalColorService } from 'Frontend/generated/endpoints.js';
import { useState } from 'react';

export default function HelloWorldView() {
  const [name, setName] = useState('');

  async function color() {
    const serverResponse = await AnimalColorService.getColors();
    return serverResponse;
  }
  console.log(color());

  return (
    <>
      <section className="flex p-m gap-m items-end">
        <TextField
          label="Your name"
          onValueChanged={(e) => {
            setName(e.detail.value);
          }}
        />
        <Button
          onClick={async () => {
            const serverResponse = await AnimalColorService.createColor(name);
          }}
        >
          Say hello
        </Button>
      </section>
    </>
  );
}
