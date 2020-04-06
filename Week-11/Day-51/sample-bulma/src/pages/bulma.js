import React from "react"
import "bulma/css/bulma.css"

const BulmaPage = () => {
  return (
    <main>
      <section className="section is-fluid">
        <div className="container is-fluid">
          <div className="columns">
            <div className="column">
              <p>This is inside of a column!</p>
            </div>
            <div className="column">
              <p>This is inside of a column!</p>
            </div>
            <div className="column">
              <p>This is inside of a column!</p>
            </div>
          </div>
        </div>
      </section>
    </main>
  )
}

export default BulmaPage
